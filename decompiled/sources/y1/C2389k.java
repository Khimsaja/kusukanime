package y1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* renamed from: y1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2389k implements Comparator, Parcelable {
    public static final Parcelable.Creator<C2389k> CREATOR = new C2387i(0);

    /* renamed from: k, reason: collision with root package name */
    public final C2388j[] f18049k;

    /* renamed from: l, reason: collision with root package name */
    public int f18050l;

    /* renamed from: m, reason: collision with root package name */
    public final String f18051m;

    /* renamed from: n, reason: collision with root package name */
    public final int f18052n;

    public C2389k(String str, boolean z7, C2388j... c2388jArr) {
        this.f18051m = str;
        c2388jArr = z7 ? (C2388j[]) c2388jArr.clone() : c2388jArr;
        this.f18049k = c2388jArr;
        this.f18052n = c2388jArr.length;
        Arrays.sort(c2388jArr, this);
    }

    public final C2389k a(String str) {
        return Objects.equals(this.f18051m, str) ? this : new C2389k(str, false, this.f18049k);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C2388j c2388j = (C2388j) obj;
        C2388j c2388j2 = (C2388j) obj2;
        UUID uuid = AbstractC2383e.a;
        return uuid.equals(c2388j.f18045l) ? uuid.equals(c2388j2.f18045l) ? 0 : 1 : c2388j.f18045l.compareTo(c2388j2.f18045l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2389k.class == obj.getClass()) {
            C2389k c2389k = (C2389k) obj;
            if (Objects.equals(this.f18051m, c2389k.f18051m) && Arrays.equals(this.f18049k, c2389k.f18049k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f18050l == 0) {
            String str = this.f18051m;
            this.f18050l = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f18049k);
        }
        return this.f18050l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f18051m);
        parcel.writeTypedArray(this.f18049k, 0);
    }

    public C2389k(Parcel parcel) {
        this.f18051m = parcel.readString();
        C2388j[] c2388jArr = (C2388j[]) parcel.createTypedArray(C2388j.CREATOR);
        int i7 = B1.K.a;
        this.f18049k = c2388jArr;
        this.f18052n = c2388jArr.length;
    }
}
