package com.kindsapplication.app.databinding;
import com.kindsapplication.app.R;
import com.kindsapplication.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAdminBloodDetailsBindingImpl extends ActivityAdminBloodDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumncodered, 2);
        sViewsWithIds.put(R.id.admindetailsCodeRed, 3);
        sViewsWithIds.put(R.id.txtCampDetails, 4);
        sViewsWithIds.put(R.id.txtCampName, 5);
        sViewsWithIds.put(R.id.admdetcampname, 6);
        sViewsWithIds.put(R.id.txtLanguage, 7);
        sViewsWithIds.put(R.id.admdetdate, 8);
        sViewsWithIds.put(R.id.txtTime, 9);
        sViewsWithIds.put(R.id.admdettime, 10);
        sViewsWithIds.put(R.id.txtAddress, 11);
        sViewsWithIds.put(R.id.admdetaddress, 12);
        sViewsWithIds.put(R.id.txtLanguageOne, 13);
        sViewsWithIds.put(R.id.admdetorganizer, 14);
        sViewsWithIds.put(R.id.btnupload, 15);
        sViewsWithIds.put(R.id.frameBottombar, 16);
        sViewsWithIds.put(R.id.linearRowrectanglethirtyone, 17);
        sViewsWithIds.put(R.id.imageBloodbankOne, 18);
        sViewsWithIds.put(R.id.imageQuoterequestNine, 19);
        sViewsWithIds.put(R.id.imageUserNineteen, 20);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAdminBloodDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private ActivityAdminBloodDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[12]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[14]
            , (android.widget.EditText) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[15]
            , (android.widget.FrameLayout) bindings[16]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[9]
            );
        this.imageRectangleThirtyOne.setTag(null);
        this.linearAdminblooddet.setTag(null);
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
        if (BR.adminBloodDetailsVM == variableId) {
            setAdminBloodDetailsVM((com.kindsapplication.app.modules.adminblooddetails.data.viewmodel.AdminBloodDetailsVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAdminBloodDetailsVM(@Nullable com.kindsapplication.app.modules.adminblooddetails.data.viewmodel.AdminBloodDetailsVM AdminBloodDetailsVM) {
        this.mAdminBloodDetailsVM = AdminBloodDetailsVM;
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

            com.kindsapplication.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangleThirtyOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangleThirtyOne.getContext(), R.drawable.img_rectangle21), imageRectangleThirtyOne.getResources().getDimension(R.dimen._30pxh), (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): adminBloodDetailsVM
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}