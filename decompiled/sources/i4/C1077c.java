package i4;

import java.util.Random;
import kotlin.jvm.internal.l;

/* renamed from: i4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1077c extends AbstractC1075a {

    /* renamed from: l, reason: collision with root package name */
    public final C1076b f12023l = new C1076b(0);

    @Override // i4.AbstractC1075a
    public final Random h() {
        Object obj = this.f12023l.get();
        l.e("get(...)", obj);
        return (Random) obj;
    }
}
