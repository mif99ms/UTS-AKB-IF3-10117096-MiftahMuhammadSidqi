package droidmentor.bnv_with_viewpager.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import droidmentor.bnv_with_viewpager.R;


/**
 * TANGGAL PENGERJAAN: 10 MEI 2020
 * NIM: 10117096
 * NAMA: MIFTAH MUHAMMAD SIDQI
 * KELAS: IF-3
 */

public class ChatFragment extends Fragment {


    public ChatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profil, container, false);
    }

}
