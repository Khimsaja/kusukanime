package K5;

import java.util.Iterator;

/* renamed from: K5.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331j extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4816k;

    /* renamed from: l, reason: collision with root package name */
    public int f4817l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0332k f4818m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0330i f4819n;

    /* renamed from: o, reason: collision with root package name */
    public Iterator f4820o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0331j(C0332k c0332k, S3.c cVar) {
        super(cVar);
        this.f4818m = c0332k;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f4816k = obj;
        this.f4817l |= Integer.MIN_VALUE;
        return this.f4818m.collect(null, this);
    }
}
