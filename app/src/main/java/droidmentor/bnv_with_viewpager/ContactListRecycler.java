package droidmentor.bnv_with_viewpager;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * TANGGAL PENGERJAAN: 10 MEI 2020
 *   NIM: 10117096
 *  NAMA: MIFTAH MUHAMMAD SIDQI
 *  KELAS: IF-3
 */

public class ContactListRecycler extends RecyclerView.Adapter<ContactViewHolder> implements View.OnClickListener {

    private List<ContactData> data;

    public ContactListRecycler(List<ContactData> data) {
        this.data = data;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_contact, parent, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        ContactData contactData = data.get(position);
        holder.bind(contactData);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public void onClick(View view) {

    }
}
