package com.kindsapplication.app.databinding;
import com.kindsapplication.app.R;
import com.kindsapplication.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityNotificationBindingImpl extends ActivityNotificationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumncodered, 4);
        sViewsWithIds.put(R.id.notiCodeRed, 5);
        sViewsWithIds.put(R.id.notilinearlayout, 6);
        sViewsWithIds.put(R.id.linearRowweburl, 7);
        sViewsWithIds.put(R.id.txtWeburl, 8);
        sViewsWithIds.put(R.id.linearRowb, 9);
        sViewsWithIds.put(R.id.frameStackb, 10);
        sViewsWithIds.put(R.id.txtMobileNo, 11);
        sViewsWithIds.put(R.id.linearColumndate, 12);
        sViewsWithIds.put(R.id.linearRowtwo, 13);
        sViewsWithIds.put(R.id.txtTwo, 14);
        sViewsWithIds.put(R.id.txtUnits, 15);
        sViewsWithIds.put(R.id.frameBottombar, 16);
        sViewsWithIds.put(R.id.linearRowrectanglethirtysix, 17);
        sViewsWithIds.put(R.id.imagedonate, 18);
        sViewsWithIds.put(R.id.imagerequest, 19);
        sViewsWithIds.put(R.id.imageprofile, 20);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityNotificationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private ActivityNotificationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.FrameLayout) bindings[16]
            , (android.widget.FrameLayout) bindings[10]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[8]
            );
        this.imagehome.setTag(null);
        this.linearNotification.setTag(null);
        this.txtB.setTag(null);
        this.txtDate.setTag(null);
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
        if (BR.notificationVM == variableId) {
            setNotificationVM((com.kindsapplication.app.modules.notification.data.viewmodel.NotificationVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNotificationVM(@Nullable com.kindsapplication.app.modules.notification.data.viewmodel.NotificationVM NotificationVM) {
        this.mNotificationVM = NotificationVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.notificationVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeNotificationVMNotificationModel((androidx.lifecycle.MutableLiveData<com.kindsapplication.app.modules.notification.data.model.NotificationModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeNotificationVMNotificationModel(androidx.lifecycle.MutableLiveData<com.kindsapplication.app.modules.notification.data.model.NotificationModel> NotificationVMNotificationModel, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.kindsapplication.app.modules.notification.data.model.NotificationModel> notificationVMNotificationModel = null;
        com.kindsapplication.app.modules.notification.data.model.NotificationModel notificationVMNotificationModelGetValue = null;
        java.lang.String notificationVMNotificationModelTxtB = null;
        com.kindsapplication.app.modules.notification.data.viewmodel.NotificationVM notificationVM = mNotificationVM;
        java.lang.String notificationVMNotificationModelTxtDate = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (notificationVM != null) {
                    // read notificationVM.notificationModel
                    notificationVMNotificationModel = notificationVM.getNotificationModel();
                }
                updateLiveDataRegistration(0, notificationVMNotificationModel);


                if (notificationVMNotificationModel != null) {
                    // read notificationVM.notificationModel.getValue()
                    notificationVMNotificationModelGetValue = notificationVMNotificationModel.getValue();
                }


                if (notificationVMNotificationModelGetValue != null) {
                    // read notificationVM.notificationModel.getValue().txtB
                    notificationVMNotificationModelTxtB = notificationVMNotificationModelGetValue.getTxtB();
                    // read notificationVM.notificationModel.getValue().txtDate
                    notificationVMNotificationModelTxtDate = notificationVMNotificationModelGetValue.getTxtDate();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.kindsapplication.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imagehome, androidx.appcompat.content.res.AppCompatResources.getDrawable(imagehome.getContext(), R.drawable.img_rectangle21), imagehome.getResources().getDimension(R.dimen._30pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtB, notificationVMNotificationModelTxtB);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDate, notificationVMNotificationModelTxtDate);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): notificationVM.notificationModel
        flag 1 (0x2L): notificationVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}