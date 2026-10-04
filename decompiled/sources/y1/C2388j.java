package y1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* renamed from: y1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2388j implements Parcelable {
    public static final Parcelable.Creator<C2388j> CREATOR = new C2387i(1);

    /* renamed from: k, reason: collision with root package name */
    public int f18044k;

    /* renamed from: l, reason: collision with root package name */
    public final UUID f18045l;

    /* renamed from: m, reason: collision with root package name */
    public final String f18046m;

    /* renamed from: n, reason: collision with root package name */
    public final String f18047n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f18048o;

    public C2388j(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f18045l = uuid;
        this.f18046m = str;
        str2.getClass();
        this.f18047n = D.m(str2);
        this.f18048o = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2388j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C2388j c2388j = (C2388j) obj;
        return Objects.equals(this.f18046m, c2388j.f18046m) && Objects.equals(this.f18047n, c2388j.f18047n) && Objects.equals(this.f18045l, c2388j.f18045l) && Arrays.equals(this.f18048o, c2388j.f18048o);
    }

    public final int hashCode() {
        if (this.f18044k == 0) {
            int iHashCode = this.f18045l.hashCode() * 31;
            String str = this.f18046m;
            this.f18044k = Arrays.hashCode(this.f18048o) + A6.b.b(this.f18047n, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }
        return this.f18044k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        UUID uuid = this.f18045l;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f18046m);
        parcel.writeString(this.f18047n);
        parcel.writeByteArray(this.f18048o);
    }

    public C2388j(Parcel parcel) {
        this.f18045l = new UUID(parcel.readLong(), parcel.readLong());
        this.f18046m = parcel.readString();
        String string = parcel.readString();
        int i7 = B1.K.a;
        this.f18047n = string;
        this.f18048o = parcel.createByteArray();
    }
}
