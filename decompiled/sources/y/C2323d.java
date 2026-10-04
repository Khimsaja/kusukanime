package y;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: y.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2323d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C2324e(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new C2324e[i7];
    }
}
