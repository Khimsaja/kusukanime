package y1;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: y1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2387i implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new C2389k(parcel);
            default:
                return new C2388j(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new C2389k[i7];
            default:
                return new C2388j[i7];
        }
    }
}
