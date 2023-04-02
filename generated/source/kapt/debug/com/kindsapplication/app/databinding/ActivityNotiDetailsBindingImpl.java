package com.kindsapplication.app.databinding;
import com.kindsapplication.app.R;
import com.kindsapplication.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityNotiDetailsBindingImpl extends ActivityNotiDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumncodered, 12);
        sViewsWithIds.put(R.id.linearColumnweburl, 13);
        sViewsWithIds.put(R.id.linearRowweburl, 14);
        sViewsWithIds.put(R.id.linearRowmobileno, 15);
        sViewsWithIds.put(R.id.linearRowdate, 16);
        sViewsWithIds.put(R.id.linearRowaccept, 17);
        sViewsWithIds.put(R.id.btnAccept, 18);
        sViewsWithIds.put(R.id.frameBottombar, 19);
        sViewsWithIds.put(R.id.linearRowrectanglefortyone, 20);
        sViewsWithIds.put(R.id.imageBloodbankOne, 21);
        sViewsWithIds.put(R.id.imageQuoterequestOne, 22);
        sViewsWithIds.put(R.id.imageUser117, 23);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityNotiDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private ActivityNotiDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[18]
            , (android.widget.FrameLayout) bindings[19]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            );
        this.imageRectangleFortyOne.setTag(null);
        this.linearNotidetails.setTag(null);
        this.txtAkshyaNagar1s.setTag(null);
        this.txtB.setTag(null);
        this.txtCodeRed.setTag(null);
        this.txtDate.setTag(null);
        this.txtGroupSix.setTag(null);
        this.txtLanguage.setTag(null);
        this.txtMobileNo.setTag(null);
        this.txtTwentyNine.setTag(null);
        this.txtTwo.setTag(null);
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
        if (BR.notiDetailsVM == variableId) {
            setNotiDetailsVM((com.kindsapplication.app.modules.notidetails.data.viewmodel.NotiDetailsVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNotiDetailsVM(@Nullable com.kindsapplication.app.modules.notidetails.data.viewmodel.NotiDetailsVM NotiDetailsVM) {
        this.mNotiDetailsVM = NotiDetailsVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.notiDetailsVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeNotiDetailsVMNotiDetailsModel((androidx.lifecycle.MutableLiveData<com.kindsapplication.app.modules.notidetails.data.model.NotiDetailsModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeNotiDetailsVMNotiDetailsModel(androidx.lifecycle.MutableLiveData<com.kindsapplication.app.modules.notidetails.data.model.NotiDetailsModel> NotiDetailsVMNotiDetailsModel, int fieldId) {
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
        java.lang.String notiDetailsVMNotiDetailsModelTxtAkshyaNagar1s = null;
        java.lang.String notiDetailsVMNotiDetailsModelTxtTwentyNine = null;
        java.lang.String notiDetailsVMNotiDetailsModelTxtTwo = null;
        androidx.lifecycle.MutableLiveData<com.kindsapplication.app.modules.notidetails.data.model.NotiDetailsModel> notiDetailsVMNotiDetailsModel = null;
        java.lang.String notiDetailsVMNotiDetailsModelTxtWeburl = null;
        com.kindsapplication.app.modules.notidetails.data.model.NotiDetailsModel notiDetailsVMNotiDetailsModelGetValue = null;
        java.lang.String notiDetailsVMNotiDetailsModelTxtDate = null;
        java.lang.String notiDetailsVMNotiDetailsModelTxtLanguage = null;
        java.lang.String notiDetailsVMNotiDetailsModelTxtGroupSix = null;
        java.lang.String notiDetailsVMNotiDetailsModelTxtCodeRed = null;
        java.lang.String notiDetailsVMNotiDetailsModelTxtMobileNo = null;
        java.lang.String notiDetailsVMNotiDetailsModelTxtB = null;
        com.kindsapplication.app.modules.notidetails.data.viewmodel.NotiDetailsVM notiDetailsVM = mNotiDetailsVM;

        if ((dirtyFlags & 0x7L) != 0) {



                if (notiDetailsVM != null) {
                    // read notiDetailsVM.notiDetailsModel
                    notiDetailsVMNotiDetailsModel = notiDetailsVM.getNotiDetailsModel();
                }
                updateLiveDataRegistration(0, notiDetailsVMNotiDetailsModel);


                if (notiDetailsVMNotiDetailsModel != null) {
                    // read notiDetailsVM.notiDetailsModel.getValue()
                    notiDetailsVMNotiDetailsModelGetValue = notiDetailsVMNotiDetailsModel.getValue();
                }


                if (notiDetailsVMNotiDetailsModelGetValue != null) {
                    // read notiDetailsVM.notiDetailsModel.getValue().txtAkshyaNagar1s
                    notiDetailsVMNotiDetailsModelTxtAkshyaNagar1s = notiDetailsVMNotiDetailsModelGetValue.getTxtAkshyaNagar1s();
                    // read notiDetailsVM.notiDetailsModel.getValue().txtTwentyNine
                    notiDetailsVMNotiDetailsModelTxtTwentyNine = notiDetailsVMNotiDetailsModelGetValue.getTxtTwentyNine();
                    // read notiDetailsVM.notiDetailsModel.getValue().txtTwo
                    notiDetailsVMNotiDetailsModelTxtTwo = notiDetailsVMNotiDetailsModelGetValue.getTxtTwo();
                    // read notiDetailsVM.notiDetailsModel.getValue().txtWeburl
                    notiDetailsVMNotiDetailsModelTxtWeburl = notiDetailsVMNotiDetailsModelGetValue.getTxtWeburl();
                    // read notiDetailsVM.notiDetailsModel.getValue().txtDate
                    notiDetailsVMNotiDetailsModelTxtDate = notiDetailsVMNotiDetailsModelGetValue.getTxtDate();
                    // read notiDetailsVM.notiDetailsModel.getValue().txtLanguage
                    notiDetailsVMNotiDetailsModelTxtLanguage = notiDetailsVMNotiDetailsModelGetValue.getTxtLanguage();
                    // read notiDetailsVM.notiDetailsModel.getValue().txtGroupSix
                    notiDetailsVMNotiDetailsModelTxtGroupSix = notiDetailsVMNotiDetailsModelGetValue.getTxtGroupSix();
                    // read notiDetailsVM.notiDetailsModel.getValue().txtCodeRed
                    notiDetailsVMNotiDetailsModelTxtCodeRed = notiDetailsVMNotiDetailsModelGetValue.getTxtCodeRed();
                    // read notiDetailsVM.notiDetailsModel.getValue().txtMobileNo
                    notiDetailsVMNotiDetailsModelTxtMobileNo = notiDetailsVMNotiDetailsModelGetValue.getTxtMobileNo();
                    // read notiDetailsVM.notiDetailsModel.getValue().txtB
                    notiDetailsVMNotiDetailsModelTxtB = notiDetailsVMNotiDetailsModelGetValue.getTxtB();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.kindsapplication.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangleFortyOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangleFortyOne.getContext(), R.drawable.img_rectangle21), imageRectangleFortyOne.getResources().getDimension(R.dimen._30pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAkshyaNagar1s, notiDetailsVMNotiDetailsModelTxtAkshyaNagar1s);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtB, notiDetailsVMNotiDetailsModelTxtB);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCodeRed, notiDetailsVMNotiDetailsModelTxtCodeRed);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDate, notiDetailsVMNotiDetailsModelTxtDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGroupSix, notiDetailsVMNotiDetailsModelTxtGroupSix);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLanguage, notiDetailsVMNotiDetailsModelTxtLanguage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtMobileNo, notiDetailsVMNotiDetailsModelTxtMobileNo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTwentyNine, notiDetailsVMNotiDetailsModelTxtTwentyNine);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTwo, notiDetailsVMNotiDetailsModelTxtTwo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeburl, notiDetailsVMNotiDetailsModelTxtWeburl);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): notiDetailsVM.notiDetailsModel
        flag 1 (0x2L): notiDetailsVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}