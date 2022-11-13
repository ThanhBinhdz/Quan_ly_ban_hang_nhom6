package com.example.quan_ly_ban_hang_nhom6.Adapter_NHOM6;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;


public class PagerAdapter extends FragmentStateAdapter {

    int soluongPage = 2;
    public PagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return  new DanhGia();
            case 1:
                return new LienHe();
            default:
                return new DanhGia();
        }

    }

    @Override
    public int getItemCount() {
        return soluongPage;
    }
}
