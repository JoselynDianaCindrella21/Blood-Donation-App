package com.kindsapplication.app.databinding;
import com.kindsapplication.app.R;
import com.kindsapplication.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityUserDetailsBindingImpl extends ActivityUserDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.udetCodeRed, 1);
        sViewsWithIds.put(R.id.txtUserDetails, 2);
        sViewsWithIds.put(R.id.txtFullname, 3);
        sViewsWithIds.put(R.id.udetfullname, 4);
        sViewsWithIds.put(R.id.txtDateofBirth, 5);
        sViewsWithIds.put(R.id.udetdob, 6);
        sViewsWithIds.put(R.id.txtAge, 7);
        sViewsWithIds.put(R.id.udetage, 8);
        sViewsWithIds.put(R.id.txtBloodGroupTyp, 9);
        sViewsWithIds.put(R.id.udetbtype, 10);
        sViewsWithIds.put(R.id.txtAddress, 11);
        sViewsWithIds.put(R.id.udetaddress, 12);
        sViewsWithIds.put(R.id.txtMedicalconditi, 13);
        sViewsWithIds.put(R.id.udetmedcond, 14);
        sViewsWithIds.put(R.id.btnContinue, 15);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityUserDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityUserDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[15]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.EditText) bindings[12]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[14]
            );
        this.linearUserdetails.setTag(null);
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
        if (BR.userDetailsVM == variableId) {
            setUserDetailsVM((com.kindsapplication.app.modules.userdetails.data.viewmodel.UserDetailsVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUserDetailsVM(@Nullable com.kindsapplication.app.modules.userdetails.data.viewmodel.UserDetailsVM UserDetailsVM) {
        this.mUserDetailsVM = UserDetailsVM;
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
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): userDetailsVM
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}