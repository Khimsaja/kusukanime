package F1;

import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class v extends i {

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f2224q = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f2225r = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f2226s = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Removed duplicated region for block: B:28:0x009d A[PHI: r2
      0x009d: PHI (r2v16 java.util.regex.Matcher) = (r2v10 java.util.regex.Matcher), (r2v8 java.util.regex.Matcher) binds: [B:26:0x0093, B:22:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static F1.v b(java.io.File r16, long r17, long r19, B0.b r21) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F1.v.b(java.io.File, long, long, B0.b):F1.v");
    }

    public static File c(File file, int i7, long j7, long j8) {
        StringBuilder sb = new StringBuilder();
        sb.append(i7);
        sb.append(".");
        sb.append(j7);
        sb.append(".");
        return new File(file, A6.b.f(j8, ".v3.exo", sb));
    }
}
