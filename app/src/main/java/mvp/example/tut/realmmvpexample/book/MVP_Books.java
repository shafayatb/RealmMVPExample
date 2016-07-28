package mvp.example.tut.realmmvpexample.book;

import android.app.AlertDialog;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.Toast;

import mvp.example.tut.realmmvpexample.book.models.Book;
import mvp.example.tut.realmmvpexample.book.view.CardViewHolder;

/**
 * Created by iBaax on 7/27/16.
 */
public interface MVP_Books {

    interface RequiredViewOps {
        Context getAppContext();

        Context getActivityContext();

        void showToast(Toast toast);

        void showAlert(AlertDialog dialog);

        void notifyItemRemoved(int position);

        void notifyDataSetChanged();

        void notifyItemInserted(int layoutPosition);

        void notifyItemRangeChanged(int positionStart, int itemCount);
    }

    interface ProvidedPresenterOps {
        void onDestroy();

        void setView();

        void clickDeleteBook();

        void clickNewBook();

        int getBookCount();

        void clickDeleteBook(Book book, int adapterPos, int layoutPos);

        CardViewHolder createViewHolder(ViewGroup parent, int viewType);

        void bindViewHolder(CardViewHolder holder, int position);

    }

    interface RequiredPresenterOps {
        Context getAppContext();

        Context getActivityContext();
    }

    interface RequiredModelOps {
        void onDestroy();

        boolean loadData();

        boolean deleteBook(Book book, int adapterPos);

        int getBookCount();

        Book getBook(int position);

        int insertBook(Book book);

        boolean BookData();
    }

}
