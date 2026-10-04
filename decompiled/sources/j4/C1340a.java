package j4;

import i4.AbstractC1075a;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.l;

/* renamed from: j4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1340a extends AbstractC1075a {
    @Override // i4.AbstractC1079e
    public final long f(long j7) {
        return ThreadLocalRandom.current().nextLong(j7);
    }

    @Override // i4.AbstractC1079e
    public final long g(long j7) {
        return ThreadLocalRandom.current().nextLong(0L, j7);
    }

    @Override // i4.AbstractC1075a
    public final Random h() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        l.e("current(...)", threadLocalRandomCurrent);
        return threadLocalRandomCurrent;
    }
}
