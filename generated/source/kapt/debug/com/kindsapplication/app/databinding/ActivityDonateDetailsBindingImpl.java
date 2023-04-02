package com.kindsapplication.app.databinding;
import com.kindsapplication.app.R;
import com.kindsapplication.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDonateDetailsBindingImpl extends ActivityDonateDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumncodered, 2);
        sViewsWithIds.put(R.id.dondetCodeRed, 3);
        sViewsWithIds.put(R.id.txtCampDetails, 4);
        sViewsWithIds.put(R.id.txtCampName, 5);
        sViewsWithIds.put(R.id.viewRectangleThirteen, 6);
        sViewsWithIds.put(R.id.txtLanguage, 7);
        sViewsWithIds.put(R.id.viewRectangleFourteen, 8);
        sViewsWithIds.put(R.id.txtTime, 9);
        sViewsWithIds.put(R.id.viewRectangleFifteen, 10);
        sViewsWithIds.put(R.id.txtAddress, 11);
        sViewsWithIds.put(R.id.viewRectangleSixteen, 12);
        sViewsWithIds.put(R.id.txtLanguageOne, 13);
        sViewsWithIds.put(R.id.etRectangleSeventeen, 14);
        sViewsWithIds.put(R.id.btnDonate, 15);
        sViewsWithIds.put(R.id.frameBottombar, 16);
        sViewsWithIds.put(R.id.linearRowrectanglethirtysix, 17);
        sViewsWithIds.put(R.id.imageBloodbankOne, 18);
        sViewsWithIds.put(R.id.imageQuoterequestOne, 19);
        sViewsWithIds.put(R.id.imageUser110, 20);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDonateDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private ActivityDonateDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[15]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[14]
            , (android.widget.FrameLayout) bindings[16]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[6]
            );
        this.imageRectangleThirtySix.setTag(null);
        this.linearDonatedetails.setTag(null);
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
        if (BR.donateDetailsVM == variableId) {
            setDonateDetailsVM((com.kindsapplication.app.modules.donatedetails.data.viewmodel.DonateDetailsVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDonateDetailsVM(@Nullable com.kindsapplication.app.modules.donatedetails.data.viewmodel.DonateDetailsVM DonateDetailsVM) {
        this.mDonateDetailsVM = DonateDetailsVM;
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

            com.kindsapplication.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangleThirtySix, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangleThirtySix.getContext(), R.drawable.img_rectangle21), imageRectangleThirtySix.getResources().getDimension(R.dimen._30pxh), (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): donateDetailsVM
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}