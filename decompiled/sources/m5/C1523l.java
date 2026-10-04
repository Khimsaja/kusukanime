package m5;

import X4.y;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import z5.AbstractC2510o;

/* renamed from: m5.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1523l implements InterfaceC1526o {

    /* renamed from: d, reason: collision with root package name */
    public static final String f12990d = AbstractC2510o.H0(C1523l.class.getCanonicalName(), ".", "");

    /* renamed from: e, reason: collision with root package name */
    public static final C1513b f12991e = new C1513b("NO_LOCKS", C1512a.f12974k);
    public final InterfaceC1525n a;

    /* renamed from: b, reason: collision with root package name */
    public final C1512a f12992b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12993c;

    public C1523l(String str) {
        this(str, new y(20, new ReentrantLock()));
    }

    public static void e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            } else if (!stackTrace[i7].getClassName().startsWith(f12990d)) {
                break;
            } else {
                i7++;
            }
        }
        List listSubList = Arrays.asList(stackTrace).subList(i7, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
    }

    public final C1520i a(InterfaceC0821a interfaceC0821a) {
        return new C1520i(this, interfaceC0821a);
    }

    public final C1516e b(e4.k kVar) {
        return new C1516e(this, new ConcurrentHashMap(3, 1.0f, 2), kVar, 1);
    }

    public final C1521j c(e4.k kVar) {
        return new C1521j(this, new ConcurrentHashMap(3, 1.0f, 2), kVar);
    }

    public E3.b d(String str, Object obj) {
        String str2;
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return AbstractC0703b.m(sb, this.f12993c, ")");
    }

    public C1523l(String str, InterfaceC1525n interfaceC1525n) {
        C1512a c1512a = C1512a.f12975l;
        this.a = interfaceC1525n;
        this.f12992b = c1512a;
        this.f12993c = str;
    }
}
