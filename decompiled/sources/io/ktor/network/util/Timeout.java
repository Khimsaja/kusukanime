package io.ktor.network.util;

import H5.A;
import H5.C0284z;
import H5.D;
import H5.InterfaceC0265f0;
import O3.C;
import P3.r;
import S3.c;
import T3.a;
import U3.e;
import U3.j;
import e4.InterfaceC0821a;
import e4.k;
import e4.n;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR*\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/ktor/network/util/Timeout;", "", "", ContentDisposition.Parameters.Name, "", "timeoutMs", "Lkotlin/Function0;", "clock", "LH5/A;", "scope", "Lkotlin/Function1;", "LS3/c;", "LO3/C;", "onTimeout", "<init>", "(Ljava/lang/String;JLe4/a;LH5/A;Le4/k;)V", "LH5/f0;", "initTimeoutJob", "()LH5/f0;", "start", "()V", "stop", "finish", "Ljava/lang/String;", "J", "Le4/a;", "LH5/A;", "Le4/k;", "workerJob", "LH5/f0;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Timeout {
    private final InterfaceC0821a clock;
    volatile /* synthetic */ int isStarted;
    volatile /* synthetic */ long lastActivityTime;
    private final String name;
    private final k onTimeout;
    private final A scope;
    private final long timeoutMs;
    private InterfaceC0265f0 workerJob;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.network.util.Timeout$initTimeoutJob$1", f = "Utils.kt", l = {55, 57, 58}, m = "invokeSuspend")
    /* renamed from: io.ktor.network.util.Timeout$initTimeoutJob$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            return Timeout.this.new AnonymousClass1(cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, c<? super C> cVar) {
            return ((AnonymousClass1) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar = a.f9048k;
            int i7 = this.label;
            if (i7 != 0 && i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.Y(obj);
                    return C.a;
                }
                r.Y(obj);
                k kVar = Timeout.this.onTimeout;
                this.label = 3;
                if (kVar.invoke(this) == aVar) {
                    return aVar;
                }
                return C.a;
            }
            r.Y(obj);
            while (true) {
                if (Timeout.this.isStarted == 0) {
                    Timeout timeout = Timeout.this;
                    timeout.lastActivityTime = ((Number) timeout.clock.invoke()).longValue();
                }
                long jLongValue = (Timeout.this.lastActivityTime + Timeout.this.timeoutMs) - ((Number) Timeout.this.clock.invoke()).longValue();
                if (jLongValue > 0 || Timeout.this.isStarted == 0) {
                    this.label = 1;
                    if (D.k(jLongValue, this) == aVar) {
                        break;
                    }
                } else {
                    this.label = 2;
                    if (D.I(this) == aVar) {
                    }
                }
            }
            return aVar;
        }
    }

    public Timeout(String str, long j7, InterfaceC0821a interfaceC0821a, A a, k kVar) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("clock", interfaceC0821a);
        l.f("scope", a);
        l.f("onTimeout", kVar);
        this.name = str;
        this.timeoutMs = j7;
        this.clock = interfaceC0821a;
        this.scope = a;
        this.onTimeout = kVar;
        this.lastActivityTime = 0L;
        this.isStarted = 0;
        this.workerJob = initTimeoutJob();
    }

    private final InterfaceC0265f0 initTimeoutJob() {
        if (this.timeoutMs == Long.MAX_VALUE) {
            return null;
        }
        A a = this.scope;
        return D.x(a, a.getCoroutineContext().plus(new C0284z("Timeout " + this.name)), new AnonymousClass1(null), 2);
    }

    public final void finish() {
        InterfaceC0265f0 interfaceC0265f0 = this.workerJob;
        if (interfaceC0265f0 != null) {
            interfaceC0265f0.e(null);
        }
    }

    public final void start() {
        this.lastActivityTime = ((Number) this.clock.invoke()).longValue();
        this.isStarted = 1;
    }

    public final void stop() {
        this.isStarted = 0;
    }
}
