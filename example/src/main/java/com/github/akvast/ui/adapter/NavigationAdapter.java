package com.github.akvast.ui.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.Toast;

import com.github.akvast.BR;
import com.github.akvast.R;
import com.github.akvast.ui.vm.NavigationHeaderViewModel;
import com.github.akvast.ui.vm.NavigationItemViewModel;
import com.github.akvast.ui.vm.SeparatorViewModel;
import com.github.akvast.viewmodeladapter.ViewModelAdapter;


public final class NavigationAdapter extends ViewModelAdapter {

    public NavigationAdapter() {
        addGlobalItem(BR.adapter, this);

        registerCell(NavigationHeaderViewModel.class, R.layout.cell_navigation_header, BR.vm);
        registerCell(NavigationItemViewModel.class, R.layout.cell_navigation_item, BR.vm);
        registerCell(SeparatorViewModel.class, R.layout.cell_separator, BR.vm);

        mItems.add(new NavigationHeaderViewModel());
        mItems.add(new NavigationItemViewModel(R.drawable.ic_person_black_24dp, R.string.profile));
        mItems.add(new NavigationItemViewModel(R.drawable.ic_settings_black_24dp, R.string.settings));
        mItems.add(new SeparatorViewModel());
        mItems.add(new NavigationItemViewModel(R.drawable.ic_exit_to_app_black_24dp, R.string.logout));
    }

    @Override
    public void reload(@Nullable SwipeRefreshLayout refreshLayout) {
        // Don't need reload items
    }

    public void itemSelected(@NonNull View view, @NonNull NavigationItemViewModel item) {
        Toast.makeText(view.getContext(), "Item `" + item.getTitle() + "` selected", Toast.LENGTH_SHORT).show();
    }

}
