package b;

import G2.C0175l;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0699d implements Parcelable {
    public static final Parcelable.Creator<C0699d> CREATOR = new C0175l(9);

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0697b f10901k;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        synchronized (this) {
            try {
                if (this.f10901k == null) {
                    this.f10901k = new BinderC0698c(this);
                }
                parcel.writeStrongBinder(this.f10901k.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i7, Bundle bundle) {
    }
}
