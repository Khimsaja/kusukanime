package f;

import G2.C0175l;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.l;

/* renamed from: f.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0846g implements Parcelable {
    public static final Parcelable.Creator<C0846g> CREATOR = new C0175l(12);

    /* renamed from: k, reason: collision with root package name */
    public final IntentSender f11384k;

    /* renamed from: l, reason: collision with root package name */
    public final Intent f11385l;

    /* renamed from: m, reason: collision with root package name */
    public final int f11386m;

    /* renamed from: n, reason: collision with root package name */
    public final int f11387n;

    public C0846g(Parcel parcel) {
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        l.c(parcelable);
        Intent intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        int i7 = parcel.readInt();
        int i8 = parcel.readInt();
        this.f11384k = (IntentSender) parcelable;
        this.f11385l = intent;
        this.f11386m = i7;
        this.f11387n = i8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        l.f("dest", parcel);
        parcel.writeParcelable(this.f11384k, i7);
        parcel.writeParcelable(this.f11385l, i7);
        parcel.writeInt(this.f11386m);
        parcel.writeInt(this.f11387n);
    }
}
