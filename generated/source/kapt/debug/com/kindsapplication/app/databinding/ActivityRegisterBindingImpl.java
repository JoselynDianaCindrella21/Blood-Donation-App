package com.kindsapplication.app.databinding;
import com.kindsapplication.app.R;
import com.kindsapplication.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRegisterBindingImpl extends ActivityRegisterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumncodered, 2);
        sViewsWithIds.put(R.id.registerCodeRed, 3);
        sViewsWithIds.put(R.id.txtSignUp, 4);
        sViewsWithIds.put(R.id.txtEmail, 5);
        sViewsWithIds.put(R.id.registeremail, 6);
        sViewsWithIds.put(R.id.txtLanguage, 7);
        sViewsWithIds.put(R.id.registermnumber, 8);
        sViewsWithIds.put(R.id.txtPassword, 9);
        sViewsWithIds.put(R.id.regidterpassword, 10);
        sViewsWithIds.put(R.id.btnRegister, 11);
        sViewsWithIds.put(R.id.textview5, 12);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[11]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.EditText) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[8]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[4]
            );
        this.frameRegister.setTag(null);
        this.imageImageOne.setTag(null);
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
        if (BR.registerVM == variableId) {
            setRegisterVM((com.kindsapplication.app.modules.register.data.viewmodel.RegisterVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRegisterVM(@Nullable com.kindsapplication.app.modules.register.data.viewmodel.RegisterVM RegisterVM) {
        this.mRegisterVM = RegisterVM;
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

            com.kindsapplication.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageImageOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageImageOne.getContext(), R.drawable.img_image1), (float)0f, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): registerVM
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}