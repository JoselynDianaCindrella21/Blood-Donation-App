package com.kindsapplication.app.databinding;
import com.kindsapplication.app.R;
import com.kindsapplication.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRequesrProofBindingImpl extends ActivityRequesrProofBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.reqproCodeRed, 2);
        sViewsWithIds.put(R.id.txtAttachProof, 3);
        sViewsWithIds.put(R.id.txtAddress, 4);
        sViewsWithIds.put(R.id.viewRectangleThirteen, 5);
        sViewsWithIds.put(R.id.btnRequestbld, 6);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRequesrProofBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityRequesrProofBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[6]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.EditText) bindings[5]
            );
        this.imageImageSeven.setTag(null);
        this.linearRequesrproof.setTag(null);
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
        if (BR.requesrProofVM == variableId) {
            setRequesrProofVM((com.kindsapplication.app.modules.requesrproof.data.viewmodel.RequesrProofVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRequesrProofVM(@Nullable com.kindsapplication.app.modules.requesrproof.data.viewmodel.RequesrProofVM RequesrProofVM) {
        this.mRequesrProofVM = RequesrProofVM;
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

            com.kindsapplication.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageImageSeven, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageImageSeven.getContext(), R.drawable.img_image7), (float)0f, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): requesrProofVM
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}