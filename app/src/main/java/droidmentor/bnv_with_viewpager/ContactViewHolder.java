package droidmentor.bnv_with_viewpager;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * TANGGAL PENGERJAAN: 10 MEI 2020
 *   NIM: 10117096
 *  NAMA: MIFTAH MUHAMMAD SIDQI
 *  KELAS: IF-3
 */


class ContactViewHolder extends RecyclerView.ViewHolder {

    private TextView name;
    private TextView phone;
    private ImageView image;

    ContactViewHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.row_contact_name);
        phone = (TextView) itemView.findViewById(R.id.row_contact_phone);
        image = (ImageView) itemView.findViewById(R.id.row_contact_image);
    }

    void bind(ContactData data){
        name.setText(data.getName());
        phone.setText(data.getPhone());
        if (data.getImage() != null) {
            image.setImageDrawable(BitmapUtility.setBitmapCircular(
                    image.getResources(), data.getImage()));
        }
    }
}
