package com.kindsapplication.app.databinding;
import com.kindsapplication.app.R;
import com.kindsapplication.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAdminHomeBindingImpl extends ActivityAdminHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumncodered, 2);
        sViewsWithIds.put(R.id.adminhomeCodeRed, 3);
        sViewsWithIds.put(R.id.linearRowrotarybloodba, 4);
        sViewsWithIds.put(R.id.Homecampname, 5);
        sViewsWithIds.put(R.id.imageView2, 6);
        sViewsWithIds.put(R.id.btnaddcamp, 7);
        sViewsWithIds.put(R.id.frameBottombar, 8);
        sViewsWithIds.put(R.id.linearRowrectangletwentyfive, 9);
        sViewsWithIds.put(R.id.imageBloodbankOne, 10);
        sViewsWithIds.put(R.id.imageQuoterequestFive, 11);
        sViewsWithIds.put(R.id.imageUserFifteen, 12);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAdminHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityAdminHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageButton) bindings[7]
            , (android.widget.FrameLayout) bindings[8]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[4]
            );
        this.imageRectangleTwentyFive.setTag(null);
        this.linearAdminhome.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.adminHomeVM == variableId) {
            setAdminHomeVM((com.kindsapplication.app.modules.adminhome.data.viewmodel.AdminHomeVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAdminHomeVM(@Nullable com.kindsapplication.app.modules.adminhome.data.viewmodel.AdminHomeVM AdminHomeVM) {
        this.mAdminHomeVM = AdminHomeVM;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.kindsapplication.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangleTwentyFive, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangleTwentyFive.getContext(), R.drawable.img_rectangle10), imageRectangleTwentyFive.getResources().getDimension(R.dimen._30pxh), (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): adminHomeVM
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}