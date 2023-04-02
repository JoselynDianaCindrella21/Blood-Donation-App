package com.kindsapplication.app.databinding;
import com.kindsapplication.app.R;
import com.kindsapplication.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDonateBloodBindingImpl extends ActivityDonateBloodBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumncodered, 4);
        sViewsWithIds.put(R.id.donateCodeRed, 5);
        sViewsWithIds.put(R.id.donatelinearlayout, 6);
        sViewsWithIds.put(R.id.txtRotaryBloodBa, 7);
        sViewsWithIds.put(R.id.frameBottombar, 8);
        sViewsWithIds.put(R.id.linearRowrectanglethirtyone, 9);
        sViewsWithIds.put(R.id.imagedonate, 10);
        sViewsWithIds.put(R.id.imagerequest, 11);
        sViewsWithIds.put(R.id.imageprofile, 12);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDonateBloodBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityDonateBloodBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[5]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.FrameLayout) bindings[8]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[7]
            );
        this.imageImageTwo.setTag(null);
        this.imagehome.setTag(null);
        this.linearDonateblood.setTag(null);
        this.txtLanguage.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.donateBloodVM == variableId) {
            setDonateBloodVM((com.kindsapplication.app.modules.donateblood.data.viewmodel.DonateBloodVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDonateBloodVM(@Nullable com.kindsapplication.app.modules.donateblood.data.viewmodel.DonateBloodVM DonateBloodVM) {
        this.mDonateBloodVM = DonateBloodVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.donateBloodVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDonateBloodVMDonateBloodModel((androidx.lifecycle.MutableLiveData<com.kindsapplication.app.modules.donateblood.data.model.DonateBloodModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDonateBloodVMDonateBloodModel(androidx.lifecycle.MutableLiveData<com.kindsapplication.app.modules.donateblood.data.model.DonateBloodModel> DonateBloodVMDonateBloodModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.lang.String donateBloodVMDonateBloodModelTxtLanguage = null;
        com.kindsapplication.app.modules.donateblood.data.viewmodel.DonateBloodVM donateBloodVM = mDonateBloodVM;
        com.kindsapplication.app.modules.donateblood.data.model.DonateBloodModel donateBloodVMDonateBloodModelGetValue = null;
        androidx.lifecycle.MutableLiveData<com.kindsapplication.app.modules.donateblood.data.model.DonateBloodModel> donateBloodVMDonateBloodModel = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (donateBloodVM != null) {
                    // read donateBloodVM.donateBloodModel
                    donateBloodVMDonateBloodModel = donateBloodVM.getDonateBloodModel();
                }
                updateLiveDataRegistration(0, donateBloodVMDonateBloodModel);


                if (donateBloodVMDonateBloodModel != null) {
                    // read donateBloodVM.donateBloodModel.getValue()
                    donateBloodVMDonateBloodModelGetValue = donateBloodVMDonateBloodModel.getValue();
                }


                if (donateBloodVMDonateBloodModelGetValue != null) {
                    // read donateBloodVM.donateBloodModel.getValue().txtLanguage
                    donateBloodVMDonateBloodModelTxtLanguage = donateBloodVMDonateBloodModelGetValue.getTxtLanguage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.kindsapplication.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageImageTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageImageTwo.getContext(), R.drawable.img_image2), (float)0f, (boolean)false);
            com.kindsapplication.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imagehome, androidx.appcompat.content.res.AppCompatResources.getDrawable(imagehome.getContext(), R.drawable.img_rectangle21), imagehome.getResources().getDimension(R.dimen._30pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLanguage, donateBloodVMDonateBloodModelTxtLanguage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): donateBloodVM.donateBloodModel
        flag 1 (0x2L): donateBloodVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}