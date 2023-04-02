package com.kindsapplication.app.databinding;
import com.kindsapplication.app.R;
import com.kindsapplication.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRequestBloodBindingImpl extends ActivityRequestBloodBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumncodered, 2);
        sViewsWithIds.put(R.id.reqbloCodeRed, 3);
        sViewsWithIds.put(R.id.txtLanguage, 4);
        sViewsWithIds.put(R.id.txtName, 5);
        sViewsWithIds.put(R.id.viewRectangleSeven, 6);
        sViewsWithIds.put(R.id.txtLanguageOne, 7);
        sViewsWithIds.put(R.id.viewRectangleEight, 8);
        sViewsWithIds.put(R.id.txtAge, 9);
        sViewsWithIds.put(R.id.viewRectangleNine, 10);
        sViewsWithIds.put(R.id.txtBloodGroupTyp, 11);
        sViewsWithIds.put(R.id.viewRectangleTen, 12);
        sViewsWithIds.put(R.id.txtLanguageTwo, 13);
        sViewsWithIds.put(R.id.etRectangleEleven, 14);
        sViewsWithIds.put(R.id.txtRequiredDate, 15);
        sViewsWithIds.put(R.id.etRectangleTwelve, 16);
        sViewsWithIds.put(R.id.btnnext, 17);
        sViewsWithIds.put(R.id.frameBottombar, 18);
        sViewsWithIds.put(R.id.linearRowrectangletwentyone, 19);
        sViewsWithIds.put(R.id.imagedonate, 20);
        sViewsWithIds.put(R.id.imagerequest, 21);
        sViewsWithIds.put(R.id.imageprofile, 22);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRequestBloodBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private ActivityRequestBloodBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[17]
            , (android.widget.EditText) bindings[14]
            , (android.widget.EditText) bindings[16]
            , (android.widget.FrameLayout) bindings[18]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[15]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[12]
            );
        this.imagehome.setTag(null);
        this.linearRequestblood.setTag(null);
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
        if (BR.requestBloodVM == variableId) {
            setRequestBloodVM((com.kindsapplication.app.modules.requestblood.data.viewmodel.RequestBloodVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRequestBloodVM(@Nullable com.kindsapplication.app.modules.requestblood.data.viewmodel.RequestBloodVM RequestBloodVM) {
        this.mRequestBloodVM = RequestBloodVM;
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

            com.kindsapplication.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imagehome, androidx.appcompat.content.res.AppCompatResources.getDrawable(imagehome.getContext(), R.drawable.img_rectangle21), imagehome.getResources().getDimension(R.dimen._30pxh), (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): requestBloodVM
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}