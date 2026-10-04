package A;

import B1.K;
import F.w;
import G2.C0174k;
import G2.s;
import M0.u;
import M0.y;
import M1.p;
import M1.x;
import O1.a0;
import android.content.Context;
import android.graphics.Typeface;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.EnumC0689p;
import io.ktor.util.GzipHeaderFlags;
import java.io.IOException;
import java.io.Serializable;
import java.util.UUID;

/* loaded from: classes.dex */
public final class e implements z6.a, I2.d, y, x, M1.l, a0, S3.g {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11k;

    public /* synthetic */ e(int i7) {
        this.f11k = i7;
    }

    public static C0174k m(Context context, G2.y yVar, Bundle bundle, EnumC0689p enumC0689p, s sVar) {
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.l.e("randomUUID().toString()", string);
        kotlin.jvm.internal.l.f("destination", yVar);
        kotlin.jvm.internal.l.f("hostLifecycleState", enumC0689p);
        return new C0174k(context, yVar, bundle, enumC0689p, sVar, string, null);
    }

    public static Typeface n(String str, u uVar, int i7) {
        if (i7 == 0 && kotlin.jvm.internal.l.a(uVar, u.f6415o) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), uVar.f6419k, i7 == 1);
    }

    public static Typeface o(String str, u uVar, int i7) {
        if (i7 == 0 && kotlin.jvm.internal.l.a(uVar, u.f6415o) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iA = n6.m.A(uVar, i7);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iA) : Typeface.create(str, iA);
    }

    public static MediaCodec p(B0.b bVar) throws IOException {
        p pVar = (p) bVar.f275k;
        StringBuilder sb = new StringBuilder("createCodec:");
        String str = pVar.a;
        sb.append(str);
        Trace.beginSection(sb.toString());
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // M1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public M1.m V0(B0.b r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 0
            android.media.MediaCodec r0 = p(r6)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r1 = "configureCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r1 = r6.f278n     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.view.Surface r1 = (android.view.Surface) r1     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r1 != 0) goto L25
            java.lang.Object r2 = r6.f275k     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            M1.p r2 = (M1.p) r2     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            boolean r2 = r2.f6468h     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r2 == 0) goto L25
            int r2 = B1.K.a     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r3 = 35
            if (r2 < r3) goto L25
            r2 = 8
            goto L26
        L21:
            r6 = move-exception
            goto L49
        L23:
            r6 = move-exception
            goto L49
        L25:
            r2 = 0
        L26:
            java.lang.Object r3 = r6.f276l     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaFormat r3 = (android.media.MediaFormat) r3     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r4 = r6.f279o     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaCrypto r4 = (android.media.MediaCrypto) r4     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.configure(r3, r1, r4, r2)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r1 = "startCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.start()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            L2.e r1 = new L2.e     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r6 = r6.f280p     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            B2.l r6 = (B2.l) r6     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r1.<init>(r0, r6)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            return r1
        L49:
            if (r0 == 0) goto L4e
            r0.release()
        L4e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: A.e.V0(B0.b):M1.m");
    }

    @Override // M1.x
    public MediaCodecInfo a(int i7) {
        return MediaCodecList.getCodecInfoAt(i7);
    }

    @Override // I2.d
    public void b(int i7, Serializable serializable) {
        String str;
        switch (this.f11k) {
            case 12:
                break;
            default:
                switch (i7) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case GzipHeaderFlags.EXTRA /* 4 */:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i7 != 6 && i7 != 7 && i7 != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    break;
                }
                break;
        }
    }

    @Override // z6.a
    public z6.b c(String str) {
        return B6.b.f549k;
    }

    @Override // O1.a0
    public int d(w wVar, G1.f fVar, int i7) {
        fVar.f575l = 4;
        return -4;
    }

    @Override // M1.x
    public boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // O1.a0
    public boolean f() {
        return true;
    }

    @Override // I2.d
    public void g() {
        switch (this.f11k) {
            case 12:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // M1.x
    public int i() {
        return MediaCodecList.getCodecCount();
    }

    @Override // O1.a0
    public int j(long j7) {
        return 0;
    }

    @Override // M1.x
    public boolean k(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // M1.x
    public boolean l() {
        return false;
    }

    public /* synthetic */ e(Context context, int i7) {
        this.f11k = i7;
    }

    public e() {
        this.f11k = 9;
        if (K.a >= 35) {
        }
    }

    private final void q() {
    }

    @Override // O1.a0
    public void h() {
    }

    private final void r(int i7, Serializable serializable) {
    }
}
