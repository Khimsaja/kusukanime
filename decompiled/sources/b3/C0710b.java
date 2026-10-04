package b3;

import G2.C0175l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.l;

/* renamed from: b3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0710b implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<C0710b> CREATOR = new C0175l(10);

    /* renamed from: k, reason: collision with root package name */
    public final String f10936k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f10937l;

    public C0710b(Map map, String str) {
        this.f10936k = str;
        this.f10937l = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0710b)) {
            return false;
        }
        C0710b c0710b = (C0710b) obj;
        return l.a(this.f10936k, c0710b.f10936k) && l.a(this.f10937l, c0710b.f10937l);
    }

    public final int hashCode() {
        return this.f10937l.hashCode() + (this.f10936k.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f10936k + ", extras=" + this.f10937l + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10936k);
        Map map = this.f10937l;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
