package l2;

import B1.B;
import java.util.Collections;
import java.util.List;

/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1409a extends AbstractC1410b {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12726b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12727c;

    public C1409a(int i7, long j7, long j8) {
        this.a = i7;
        switch (i7) {
            case 2:
                this.f12726b = j7;
                this.f12727c = j8;
                break;
            default:
                this.f12726b = j8;
                this.f12727c = j7;
                break;
        }
    }

    public static long d(long j7, B b4) {
        long jT = b4.t();
        if ((128 & jT) != 0) {
            return 8589934591L & ((((jT & 1) << 32) | b4.v()) + j7);
        }
        return -9223372036854775807L;
    }

    @Override // l2.AbstractC1410b
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.f12726b);
                sb.append(", identifier= ");
                return A6.b.f(this.f12727c, " }", sb);
            case 1:
                StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
                sb2.append(this.f12726b);
                sb2.append(", programSplicePlaybackPositionUs= ");
                return A6.b.f(this.f12727c, " }", sb2);
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.f12726b);
                sb3.append(", playbackPositionUs= ");
                return A6.b.f(this.f12727c, " }", sb3);
        }
    }

    public C1409a(long j7, long j8, List list) {
        this.a = 1;
        this.f12726b = j7;
        this.f12727c = j8;
        Collections.unmodifiableList(list);
    }
}
