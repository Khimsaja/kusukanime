package X;

import e4.InterfaceC0821a;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: m, reason: collision with root package name */
    public static final h f9687m = new h(0, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final h f9688n = new h(0, 1);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9689l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i7, int i8) {
        super(i7);
        this.f9689l = i8;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f9689l) {
            case 0:
                return new g(new LinkedHashMap());
            default:
                return null;
        }
    }
}
