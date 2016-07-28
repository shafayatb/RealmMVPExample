package mvp.example.tut.realmmvpexample.book.view;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import mvp.example.tut.realmmvpexample.book.MVP_Books;
import mvp.example.tut.realmmvpexample.book.adapters.RealmRecyclerViewAdapter;
import mvp.example.tut.realmmvpexample.book.models.Book;

/**
 * Created by iBaax on 7/28/16.
 */
public class BookAdapter extends RealmRecyclerViewAdapter<Book> {

    MVP_Books.ProvidedPresenterOps mPresenter;

    public BookAdapter(MVP_Books.ProvidedPresenterOps mPresenter) {
        this.mPresenter = mPresenter;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return mPresenter.createViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        mPresenter.bindViewHolder((CardViewHolder) holder, position);
    }

    @Override
    public int getItemCount() {
        return mPresenter.getBookCount();
    }
}
