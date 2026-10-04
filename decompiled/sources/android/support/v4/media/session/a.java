package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i7) {
        this.a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.a) {
            case 0:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f10510k = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 1:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new a(1);

                    /* renamed from: k, reason: collision with root package name */
                    public final MediaDescriptionCompat f10508k;

                    /* renamed from: l, reason: collision with root package name */
                    public final long f10509l;

                    {
                        this.f10508k = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f10509l = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
                        sb.append(this.f10508k);
                        sb.append(", Id=");
                        return A6.b.f(this.f10509l, " }", sb);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i7) {
                        this.f10508k.writeToParcel(parcel2, i7);
                        parcel2.writeLong(this.f10509l);
                    }
                };
            case 2:
                final Parcelable parcelable = parcel.readParcelable(null);
                return new Parcelable(parcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new a(2);

                    /* renamed from: k, reason: collision with root package name */
                    public final Object f10511k = new Object();

                    /* renamed from: l, reason: collision with root package name */
                    public final Parcelable f10512l;

                    {
                        this.f10512l = parcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
                        Parcelable parcelable2 = this.f10512l;
                        if (parcelable2 == null) {
                            return mediaSessionCompat$Token.f10512l == null;
                        }
                        Parcelable parcelable3 = mediaSessionCompat$Token.f10512l;
                        if (parcelable3 == null) {
                            return false;
                        }
                        return parcelable2.equals(parcelable3);
                    }

                    public final int hashCode() {
                        Parcelable parcelable2 = this.f10512l;
                        if (parcelable2 == null) {
                            return 0;
                        }
                        return parcelable2.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i7) {
                        parcel2.writeParcelable(this.f10512l, i7);
                    }
                };
            case 3:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f10513k = parcel.readInt();
                parcelableVolumeInfo.f10515m = parcel.readInt();
                parcelableVolumeInfo.f10516n = parcel.readInt();
                parcelableVolumeInfo.f10517o = parcel.readInt();
                parcelableVolumeInfo.f10514l = parcel.readInt();
                return parcelableVolumeInfo;
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i7];
            case 1:
                return new MediaSessionCompat$QueueItem[i7];
            case 2:
                return new MediaSessionCompat$Token[i7];
            case 3:
                return new ParcelableVolumeInfo[i7];
            default:
                return new PlaybackStateCompat[i7];
        }
    }
}
