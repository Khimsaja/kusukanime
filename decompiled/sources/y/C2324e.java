package y;

import android.os.Parcel;
import android.os.Parcelable;
import b1.AbstractC0703b;

/* renamed from: y.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2324e implements Parcelable {
    public static final Parcelable.Creator<C2324e> CREATOR = new C2323d();

    /* renamed from: k, reason: collision with root package name */
    public final int f17620k;

    public C2324e(int i7) {
        this.f17620k = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2324e) && this.f17620k == ((C2324e) obj).f17620k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17620k);
    }

    public final String toString() {
        return AbstractC0703b.l(new StringBuilder("DefaultLazyKey(index="), this.f17620k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f17620k);
    }
}
