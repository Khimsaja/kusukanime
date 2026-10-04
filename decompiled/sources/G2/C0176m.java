package G2;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0689p;

/* renamed from: G2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176m implements Parcelable {
    public static final Parcelable.Creator<C0176m> CREATOR = new C0175l(0);

    /* renamed from: k, reason: collision with root package name */
    public final String f2714k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2715l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f2716m;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f2717n;

    public C0176m(C0174k c0174k) {
        kotlin.jvm.internal.l.f("entry", c0174k);
        this.f2714k = c0174k.f2707p;
        this.f2715l = c0174k.f2703l.f2762p;
        this.f2716m = c0174k.g();
        Bundle bundle = new Bundle();
        this.f2717n = bundle;
        c0174k.f2710s.q1(bundle);
    }

    public final C0174k a(Context context, y yVar, EnumC0689p enumC0689p, s sVar) {
        kotlin.jvm.internal.l.f("context", context);
        kotlin.jvm.internal.l.f("hostLifecycleState", enumC0689p);
        Bundle bundle = this.f2716m;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String str = this.f2714k;
        kotlin.jvm.internal.l.f("id", str);
        return new C0174k(context, yVar, bundle2, enumC0689p, sVar, str, this.f2717n);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        kotlin.jvm.internal.l.f("parcel", parcel);
        parcel.writeString(this.f2714k);
        parcel.writeInt(this.f2715l);
        parcel.writeBundle(this.f2716m);
        parcel.writeBundle(this.f2717n);
    }

    public C0176m(Parcel parcel) {
        String string = parcel.readString();
        kotlin.jvm.internal.l.c(string);
        this.f2714k = string;
        this.f2715l = parcel.readInt();
        this.f2716m = parcel.readBundle(C0176m.class.getClassLoader());
        Bundle bundle = parcel.readBundle(C0176m.class.getClassLoader());
        kotlin.jvm.internal.l.c(bundle);
        this.f2717n = bundle;
    }
}
