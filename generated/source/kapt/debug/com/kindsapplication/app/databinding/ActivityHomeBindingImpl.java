package com.kindsapplication.app.databinding;
import com.kindsapplication.app.R;
import com.kindsapplication.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHomeBindingImpl extends ActivityHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumncodered, 2);
        sViewsWithIds.put(R.id.toolbarToolbar, 3);
        sViewsWithIds.put(R.id.linearRowcodered, 4);
        sViewsWithIds.put(R.id.frameStackcodered, 5);
        sViewsWithIds.put(R.id.homeCodeRedOne, 6);
        sViewsWithIds.put(R.id.frameStackbellone, 7);
        sViewsWithIds.put(R.id.imageBellTwo, 8);
        sViewsWithIds.put(R.id.imageMenuTwo, 9);
        sViewsWithIds.put(R.id.imageView, 10);
        sViewsWithIds.put(R.id.frameStackdonateblood, 11);
        sViewsWithIds.put(R.id.txtDonateBlood, 12);
        sViewsWithIds.put(R.id.btnDonateBloodOne, 13);
        sViewsWithIds.put(R.id.frameStackrequestblood, 14);
        sViewsWithIds.put(R.id.txtRequestBlood, 15);
        sViewsWithIds.put(R.id.btnRequestBloodOne, 16);
        sViewsWithIds.put(R.id.frameBottombar, 17);
        sViewsWithIds.put(R.id.linearRowrectangleten, 18);
        sViewsWithIds.put(R.id.imagedonate, 19);
        sViewsWithIds.put(R.id.imagerequest, 20);
        sViewsWithIds.put(R.id.imageprofile, 21);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private ActivityHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[13]
            , (androidx.appcompat.widget.AppCompatButton) bindings[16]
            , (android.widget.FrameLayout) bindings[17]
            , (android.widget.FrameLayout) bindings[7]
            , (android.widget.FrameLayout) bindings[5]
            , (android.widget.FrameLayout) bindings[11]
            , (android.widget.FrameLayout) bindings[14]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[18]
            , (androidx.appcompat.widget.Toolbar) bindings[3]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[15]
            );
        this.imagehome.setTag(null);
        this.linearHome.setTag(null);
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
        if (BR.homeVM == variableId) {
            setHomeVM((com.kindsapplication.app.modules.home.data.viewmodel.HomeVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHomeVM(@Nullable com.kindsapplication.app.modules.home.data.viewmodel.HomeVM HomeVM) {
        this.mHomeVM = HomeVM;
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

            com.kindsapplication.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imagehome, androidx.appcompat.content.res.AppCompatResources.getDrawable(imagehome.getContext(), R.drawable.img_rectangle10), imagehome.getResources().getDimension(R.dimen._30pxh), (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): homeVM
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}