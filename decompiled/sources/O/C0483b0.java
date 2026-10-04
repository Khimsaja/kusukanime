package O;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: O.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0483b0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new C0485c0(parcel.readFloat());
            case 1:
                return new C0487d0(parcel.readInt());
            default:
                return new C0489e0(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new C0485c0[i7];
            case 1:
                return new C0487d0[i7];
            default:
                return new C0489e0[i7];
        }
    }
}
