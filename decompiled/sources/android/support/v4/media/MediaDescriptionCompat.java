package android.support.v4.media;

import G2.C0175l;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0175l(6);

    /* renamed from: k, reason: collision with root package name */
    public final String f10496k;

    /* renamed from: l, reason: collision with root package name */
    public final CharSequence f10497l;

    /* renamed from: m, reason: collision with root package name */
    public final CharSequence f10498m;

    /* renamed from: n, reason: collision with root package name */
    public final CharSequence f10499n;

    /* renamed from: o, reason: collision with root package name */
    public final Bitmap f10500o;

    /* renamed from: p, reason: collision with root package name */
    public final Uri f10501p;

    /* renamed from: q, reason: collision with root package name */
    public final Bundle f10502q;

    /* renamed from: r, reason: collision with root package name */
    public final Uri f10503r;

    /* renamed from: s, reason: collision with root package name */
    public MediaDescription f10504s;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f10496k = str;
        this.f10497l = charSequence;
        this.f10498m = charSequence2;
        this.f10499n = charSequence3;
        this.f10500o = bitmap;
        this.f10501p = uri;
        this.f10502q = bundle;
        this.f10503r = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f10497l) + ", " + ((Object) this.f10498m) + ", " + ((Object) this.f10499n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        MediaDescription mediaDescriptionA = this.f10504s;
        if (mediaDescriptionA == null) {
            MediaDescription.Builder builderB = a.b();
            a.n(builderB, this.f10496k);
            a.p(builderB, this.f10497l);
            a.o(builderB, this.f10498m);
            a.j(builderB, this.f10499n);
            a.l(builderB, this.f10500o);
            a.m(builderB, this.f10501p);
            a.k(builderB, this.f10502q);
            b.b(builderB, this.f10503r);
            mediaDescriptionA = a.a(builderB);
            this.f10504s = mediaDescriptionA;
        }
        mediaDescriptionA.writeToParcel(parcel, i7);
    }
}
