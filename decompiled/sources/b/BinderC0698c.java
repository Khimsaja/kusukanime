package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: b.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0698c extends Binder implements InterfaceC0697b {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10899c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0699d f10900b;

    public BinderC0698c(C0699d c0699d) {
        this.f10900b = c0699d;
        attachInterface(this, InterfaceC0697b.a);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        String str = InterfaceC0697b.a;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i7 != 1) {
            return super.onTransact(i7, parcel, parcel2, i8);
        }
        this.f10900b.a(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
