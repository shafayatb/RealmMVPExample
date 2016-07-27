package mvp.example.tut.realmmvpexample.book.realm;

import android.app.Application;
import android.support.v4.app.Fragment;

import io.realm.Realm;
import io.realm.RealmResults;
import mvp.example.tut.realmmvpexample.book.models.Book;

/**
 * Created by iBaax on 7/27/16.
 */
public class RealmController {

    private static RealmController instance;
    private final Realm realm;

    public RealmController(Application application) {
        realm = Realm.getDefaultInstance();
    }

    public static RealmController with(Fragment fragment) {
        if (instance == null) {
            instance = new RealmController(fragment.getActivity().getApplication());
        }
        return instance;
    }

    public static RealmController with(Application application) {
        if (instance == null) {
            instance = new RealmController(application);
        }
        return instance;
    }

    public static RealmController getInstance() {
        return instance;
    }

    public Realm getRealm() {
        return realm;
    }

    public void refresh() {
        realm.waitForChange();
    }

    public void clearAll() {
        realm.beginTransaction();
        realm.deleteAll();
        realm.commitTransaction();
    }

    public RealmResults<Book> getBooks() {
        return realm.where(Book.class).findAll();
    }

    public Book getBook(String id) {
        return realm.where(Book.class).equalTo("id", id).findFirst();
    }

    public boolean hasBooks() {

        return !realm.where(Book.class).findAll().isEmpty();
    }

    public RealmResults<Book> queryedBooks() {
        return realm.where(Book.class)
                .contains("author", "Author 0")
                .or()
                .contains("title", "Realm")
                .findAll();
    }


}
