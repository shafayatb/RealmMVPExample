package mvp.example.tut.realmmvpexample.book.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import io.realm.RealmBaseAdapter;
import io.realm.RealmObject;
import io.realm.RealmResults;

/**
 * Created by iBaax on 7/28/16.
 */
public class RealmModelAdapter<T extends RealmObject> extends RealmBaseAdapter<T> {


    public RealmModelAdapter(Context context, RealmResults<T> realmResults, boolean automaticUpdate) {
        super(context, realmResults);

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
