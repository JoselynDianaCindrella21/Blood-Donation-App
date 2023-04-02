package com.kindsapplication.app.databinding;
import com.kindsapplication.app.R;
import com.kindsapplication.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityProfileBindingImpl extends ActivityProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumncodered, 14);
        sViewsWithIds.put(R.id.frameStackweburl, 15);
        sViewsWithIds.put(R.id.linearRowweburl, 16);
        sViewsWithIds.put(R.id.Bloodgrp, 17);
        sViewsWithIds.put(R.id.linearColumnemail, 18);
        sViewsWithIds.put(R.id.frameBottombar, 19);
        sViewsWithIds.put(R.id.linearRowrectanglefortyfour, 20);
        sViewsWithIds.put(R.id.imageBloodbankOne, 21);
        sViewsWithIds.put(R.id.imageQuoterequestOne, 22);
        sViewsWithIds.put(R.id.imageUser118, 23);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private ActivityProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[17]
            , (android.widget.FrameLayout) bindings[19]
            , (android.widget.FrameLayout) bindings[15]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[2]
            );
        this.imageRectangleFortyFour.setTag(null);
        this.linearProfile.setTag(null);
        this.txtAddress.setTag(null);
        this.txtAge.setTag(null);
        this.txtAkshyaNagar1s.setTag(null);
        this.txtCodeRed.setTag(null);
        this.txtDate.setTag(null);
        this.txtDateofBirth.setTag(null);
        this.txtEmail.setTag(null);
        this.txtEmailOne.setTag(null);
        this.txtMedicalconditi.setTag(null);
        this.txtNil.setTag(null);
        this.txtTwentyTwo.setTag(null);
        this.txtWeburl.setTag(null);
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
        if (BR.profileVM == variableId) {
            setProfileVM((com.kindsapplication.app.modules.profile.data.viewmodel.ProfileVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProfileVM(@Nullable com.kindsapplication.app.modules.profile.data.viewmodel.ProfileVM ProfileVM) {
        this.mProfileVM = ProfileVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.profileVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProfileVMProfileModel((androidx.lifecycle.MutableLiveData<com.kindsapplication.app.modules.profile.data.model.ProfileModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProfileVMProfileModel(androidx.lifecycle.MutableLiveData<com.kindsapplication.app.modules.profile.data.model.ProfileModel> ProfileVMProfileModel, int fieldId) {
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
        java.lang.String profileVMProfileModelTxtCodeRed = null;
        androidx.lifecycle.MutableLiveData<com.kindsapplication.app.modules.profile.data.model.ProfileModel> profileVMProfileModel = null;
        java.lang.String profileVMProfileModelTxtTwentyTwo = null;
        java.lang.String profileVMProfileModelTxtAkshyaNagar1s = null;
        java.lang.String profileVMProfileModelTxtAddress = null;
        java.lang.String profileVMProfileModelTxtEmail = null;
        java.lang.String profileVMProfileModelTxtAge = null;
        com.kindsapplication.app.modules.profile.data.model.ProfileModel profileVMProfileModelGetValue = null;
        java.lang.String profileVMProfileModelTxtNil = null;
        java.lang.String profileVMProfileModelTxtMedicalconditi = null;
        java.lang.String profileVMProfileModelTxtWeburl = null;
        com.kindsapplication.app.modules.profile.data.viewmodel.ProfileVM profileVM = mProfileVM;
        java.lang.String profileVMProfileModelTxtEmailOne = null;
        java.lang.String profileVMProfileModelTxtDate = null;
        java.lang.String profileVMProfileModelTxtDateofBirth = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (profileVM != null) {
                    // read profileVM.profileModel
                    profileVMProfileModel = profileVM.getProfileModel();
                }
                updateLiveDataRegistration(0, profileVMProfileModel);


                if (profileVMProfileModel != null) {
                    // read profileVM.profileModel.getValue()
                    profileVMProfileModelGetValue = profileVMProfileModel.getValue();
                }


                if (profileVMProfileModelGetValue != null) {
                    // read profileVM.profileModel.getValue().txtCodeRed
                    profileVMProfileModelTxtCodeRed = profileVMProfileModelGetValue.getTxtCodeRed();
                    // read profileVM.profileModel.getValue().txtTwentyTwo
                    profileVMProfileModelTxtTwentyTwo = profileVMProfileModelGetValue.getTxtTwentyTwo();
                    // read profileVM.profileModel.getValue().txtAkshyaNagar1s
                    profileVMProfileModelTxtAkshyaNagar1s = profileVMProfileModelGetValue.getTxtAkshyaNagar1s();
                    // read profileVM.profileModel.getValue().txtAddress
                    profileVMProfileModelTxtAddress = profileVMProfileModelGetValue.getTxtAddress();
                    // read profileVM.profileModel.getValue().txtEmail
                    profileVMProfileModelTxtEmail = profileVMProfileModelGetValue.getTxtEmail();
                    // read profileVM.profileModel.getValue().txtAge
                    profileVMProfileModelTxtAge = profileVMProfileModelGetValue.getTxtAge();
                    // read profileVM.profileModel.getValue().txtNil
                    profileVMProfileModelTxtNil = profileVMProfileModelGetValue.getTxtNil();
                    // read profileVM.profileModel.getValue().txtMedicalconditi
                    profileVMProfileModelTxtMedicalconditi = profileVMProfileModelGetValue.getTxtMedicalconditi();
                    // read profileVM.profileModel.getValue().txtWeburl
                    profileVMProfileModelTxtWeburl = profileVMProfileModelGetValue.getTxtWeburl();
                    // read profileVM.profileModel.getValue().txtEmailOne
                    profileVMProfileModelTxtEmailOne = profileVMProfileModelGetValue.getTxtEmailOne();
                    // read profileVM.profileModel.getValue().txtDate
                    profileVMProfileModelTxtDate = profileVMProfileModelGetValue.getTxtDate();
                    // read profileVM.profileModel.getValue().txtDateofBirth
                    profileVMProfileModelTxtDateofBirth = profileVMProfileModelGetValue.getTxtDateofBirth();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.kindsapplication.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangleFortyFour, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangleFortyFour.getContext(), R.drawable.img_rectangle21), imageRectangleFortyFour.getResources().getDimension(R.dimen._30pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAddress, profileVMProfileModelTxtAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAge, profileVMProfileModelTxtAge);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAkshyaNagar1s, profileVMProfileModelTxtAkshyaNagar1s);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCodeRed, profileVMProfileModelTxtCodeRed);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDate, profileVMProfileModelTxtDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDateofBirth, profileVMProfileModelTxtDateofBirth);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEmail, profileVMProfileModelTxtEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEmailOne, profileVMProfileModelTxtEmailOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtMedicalconditi, profileVMProfileModelTxtMedicalconditi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNil, profileVMProfileModelTxtNil);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTwentyTwo, profileVMProfileModelTxtTwentyTwo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeburl, profileVMProfileModelTxtWeburl);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): profileVM.profileModel
        flag 1 (0x2L): profileVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}