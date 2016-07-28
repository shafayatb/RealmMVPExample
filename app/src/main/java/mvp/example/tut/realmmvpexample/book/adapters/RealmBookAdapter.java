package mvp.example.tut.realmmvpexample.book.adapters;

import android.content.Context;

import io.realm.RealmResults;
import mvp.example.tut.realmmvpexample.book.models.Book;

/**
 * Created by iBaax on 7/28/16.
 */
public class RealmBookAdapter extends RealmModelAdapter<Book> {
    public RealmBookAdapter(Context context, RealmResults<Book> realmResults, boolean automaticUpdate) {
        super(context, realmResults, automaticUpdate);
    }
}
