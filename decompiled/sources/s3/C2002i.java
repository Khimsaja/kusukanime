package s3;

import androidx.media3.exoplayer.ExoPlayer;
import java.lang.reflect.InvocationTargetException;

/* renamed from: s3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2002i implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15707k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f15708l;

    public /* synthetic */ C2002i(ExoPlayer exoPlayer, int i7) {
        this.f15707k = i7;
        this.f15708l = exoPlayer;
    }

    @Override // e4.k
    public final Object invoke(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f15707k) {
            case 0:
                kotlin.jvm.internal.l.f("$this$DisposableEffect", (O.H) obj);
                return new D.r(8, this.f15708l);
            default:
                F2.E e7 = (F2.E) obj;
                kotlin.jvm.internal.l.f("view", e7);
                y1.L player = e7.getPlayer();
                ExoPlayer exoPlayer = this.f15708l;
                if (player != exoPlayer) {
                    e7.setPlayer(exoPlayer);
                }
                return O3.C.a;
        }
    }
}
