package G1;

import B1.K;
import F.w;
import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class b {
    public byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f2598b;

    /* renamed from: c, reason: collision with root package name */
    public int f2599c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f2600d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f2601e;

    /* renamed from: f, reason: collision with root package name */
    public int f2602f;

    /* renamed from: g, reason: collision with root package name */
    public int f2603g;

    /* renamed from: h, reason: collision with root package name */
    public int f2604h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f2605i;

    /* renamed from: j, reason: collision with root package name */
    public final w f2606j;

    public b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f2605i = cryptoInfo;
        this.f2606j = K.a >= 24 ? new w(cryptoInfo) : null;
    }
}
