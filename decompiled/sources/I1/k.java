package I1;

import B1.AbstractC0015b;
import B1.K;
import B1.RunnableC0016c;
import F.w;
import O1.B;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import java.util.concurrent.Executor;
import y1.C2393o;
import y1.C2398u;
import y1.F;
import y1.N;
import y1.O;
import y1.P;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: A, reason: collision with root package name */
    public int f3975A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3976B;
    public final Context a;

    /* renamed from: c, reason: collision with root package name */
    public final h f3978c;

    /* renamed from: d, reason: collision with root package name */
    public final PlaybackSession f3979d;

    /* renamed from: j, reason: collision with root package name */
    public String f3985j;

    /* renamed from: k, reason: collision with root package name */
    public PlaybackMetrics.Builder f3986k;

    /* renamed from: l, reason: collision with root package name */
    public int f3987l;

    /* renamed from: o, reason: collision with root package name */
    public F f3990o;

    /* renamed from: p, reason: collision with root package name */
    public w f3991p;

    /* renamed from: q, reason: collision with root package name */
    public w f3992q;

    /* renamed from: r, reason: collision with root package name */
    public w f3993r;

    /* renamed from: s, reason: collision with root package name */
    public C2393o f3994s;

    /* renamed from: t, reason: collision with root package name */
    public C2393o f3995t;

    /* renamed from: u, reason: collision with root package name */
    public C2393o f3996u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3997v;

    /* renamed from: w, reason: collision with root package name */
    public int f3998w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3999x;

    /* renamed from: y, reason: collision with root package name */
    public int f4000y;

    /* renamed from: z, reason: collision with root package name */
    public int f4001z;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f3977b = AbstractC0015b.o();

    /* renamed from: f, reason: collision with root package name */
    public final O f3981f = new O();

    /* renamed from: g, reason: collision with root package name */
    public final N f3982g = new N();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f3984i = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f3983h = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final long f3980e = SystemClock.elapsedRealtime();

    /* renamed from: m, reason: collision with root package name */
    public int f3988m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f3989n = 0;

    public k(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.f3979d = playbackSession;
        h hVar = new h();
        this.f3978c = hVar;
        hVar.f3971d = this;
    }

    public final boolean a(w wVar) {
        String str;
        if (wVar == null) {
            return false;
        }
        String str2 = (String) wVar.f2038m;
        h hVar = this.f3978c;
        synchronized (hVar) {
            str = hVar.f3973f;
        }
        return str2.equals(str);
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.f3986k;
        if (builder != null && this.f3976B) {
            builder.setAudioUnderrunCount(this.f3975A);
            this.f3986k.setVideoFramesDropped(this.f4000y);
            this.f3986k.setVideoFramesPlayed(this.f4001z);
            Long l7 = (Long) this.f3983h.get(this.f3985j);
            this.f3986k.setNetworkTransferDurationMillis(l7 == null ? 0L : l7.longValue());
            Long l8 = (Long) this.f3984i.get(this.f3985j);
            this.f3986k.setNetworkBytesRead(l8 == null ? 0L : l8.longValue());
            this.f3986k.setStreamSource((l8 == null || l8.longValue() <= 0) ? 0 : 1);
            this.f3977b.execute(new RunnableC0016c(9, this, this.f3986k.build()));
        }
        this.f3986k = null;
        this.f3985j = null;
        this.f3975A = 0;
        this.f4000y = 0;
        this.f4001z = 0;
        this.f3994s = null;
        this.f3995t = null;
        this.f3996u = null;
        this.f3976B = false;
    }

    public final void c(P p7, B b4) {
        int iB;
        PlaybackMetrics.Builder builder = this.f3986k;
        if (b4 == null || (iB = p7.b(b4.a)) == -1) {
            return;
        }
        N n7 = this.f3982g;
        int i7 = 0;
        p7.f(iB, n7, false);
        int i8 = n7.f17948c;
        O o7 = this.f3981f;
        p7.n(i8, o7);
        C2398u c2398u = o7.f17956c.f18138b;
        if (c2398u != null) {
            int iZ = K.z(c2398u.a, c2398u.f18134b);
            i7 = iZ != 0 ? iZ != 1 ? iZ != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i7);
        if (o7.f17965l != -9223372036854775807L && !o7.f17963j && !o7.f17961h && !o7.a()) {
            builder.setMediaDurationMillis(K.P(o7.f17965l));
        }
        builder.setPlaybackType(o7.a() ? 2 : 1);
        this.f3976B = true;
    }

    public final void d(a aVar, String str) {
        B b4 = aVar.f3939d;
        if ((b4 == null || !b4.b()) && str.equals(this.f3985j)) {
            b();
        }
        this.f3983h.remove(str);
        this.f3984i.remove(str);
    }

    public final void e(int i7, long j7, C2393o c2393o) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = i.l(i7).setTimeSinceCreatedMillis(j7 - this.f3980e);
        if (c2393o != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(2);
            String str = c2393o.f18111m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c2393o.f18112n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c2393o.f18109k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i8 = c2393o.f18108j;
            if (i8 != -1) {
                timeSinceCreatedMillis.setBitrate(i8);
            }
            int i9 = c2393o.f18119u;
            if (i9 != -1) {
                timeSinceCreatedMillis.setWidth(i9);
            }
            int i10 = c2393o.f18120v;
            if (i10 != -1) {
                timeSinceCreatedMillis.setHeight(i10);
            }
            int i11 = c2393o.f18091D;
            if (i11 != -1) {
                timeSinceCreatedMillis.setChannelCount(i11);
            }
            int i12 = c2393o.f18092E;
            if (i12 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i12);
            }
            String str4 = c2393o.f18102d;
            if (str4 != null) {
                int i13 = K.a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f5 = c2393o.f18121w;
            if (f5 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f5);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f3976B = true;
        this.f3977b.execute(new RunnableC0016c(6, this, timeSinceCreatedMillis.build()));
    }
}
