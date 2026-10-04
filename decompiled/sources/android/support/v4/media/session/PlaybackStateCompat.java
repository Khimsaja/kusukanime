package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a(4);

    /* renamed from: k, reason: collision with root package name */
    public final int f10518k;

    /* renamed from: l, reason: collision with root package name */
    public final long f10519l;

    /* renamed from: m, reason: collision with root package name */
    public final long f10520m;

    /* renamed from: n, reason: collision with root package name */
    public final float f10521n;

    /* renamed from: o, reason: collision with root package name */
    public final long f10522o;

    /* renamed from: p, reason: collision with root package name */
    public final int f10523p;

    /* renamed from: q, reason: collision with root package name */
    public final CharSequence f10524q;

    /* renamed from: r, reason: collision with root package name */
    public final long f10525r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f10526s;

    /* renamed from: t, reason: collision with root package name */
    public final long f10527t;

    /* renamed from: u, reason: collision with root package name */
    public final Bundle f10528u;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new c();

        /* renamed from: k, reason: collision with root package name */
        public final String f10529k;

        /* renamed from: l, reason: collision with root package name */
        public final CharSequence f10530l;

        /* renamed from: m, reason: collision with root package name */
        public final int f10531m;

        /* renamed from: n, reason: collision with root package name */
        public final Bundle f10532n;

        public CustomAction(Parcel parcel) {
            this.f10529k = parcel.readString();
            this.f10530l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f10531m = parcel.readInt();
            this.f10532n = parcel.readBundle(b.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f10530l) + ", mIcon=" + this.f10531m + ", mExtras=" + this.f10532n;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f10529k);
            TextUtils.writeToParcel(this.f10530l, parcel, i7);
            parcel.writeInt(this.f10531m);
            parcel.writeBundle(this.f10532n);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f10518k = parcel.readInt();
        this.f10519l = parcel.readLong();
        this.f10521n = parcel.readFloat();
        this.f10525r = parcel.readLong();
        this.f10520m = parcel.readLong();
        this.f10522o = parcel.readLong();
        this.f10524q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f10526s = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f10527t = parcel.readLong();
        this.f10528u = parcel.readBundle(b.class.getClassLoader());
        this.f10523p = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f10518k);
        sb.append(", position=");
        sb.append(this.f10519l);
        sb.append(", buffered position=");
        sb.append(this.f10520m);
        sb.append(", speed=");
        sb.append(this.f10521n);
        sb.append(", updated=");
        sb.append(this.f10525r);
        sb.append(", actions=");
        sb.append(this.f10522o);
        sb.append(", error code=");
        sb.append(this.f10523p);
        sb.append(", error message=");
        sb.append(this.f10524q);
        sb.append(", custom actions=");
        sb.append(this.f10526s);
        sb.append(", active item id=");
        return A6.b.f(this.f10527t, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f10518k);
        parcel.writeLong(this.f10519l);
        parcel.writeFloat(this.f10521n);
        parcel.writeLong(this.f10525r);
        parcel.writeLong(this.f10520m);
        parcel.writeLong(this.f10522o);
        TextUtils.writeToParcel(this.f10524q, parcel, i7);
        parcel.writeTypedList(this.f10526s);
        parcel.writeLong(this.f10527t);
        parcel.writeBundle(this.f10528u);
        parcel.writeInt(this.f10523p);
    }
}
