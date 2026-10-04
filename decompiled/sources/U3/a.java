package U3;

import O3.C;
import P3.r;
import io.ktor.http.ContentDisposition;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class a implements S3.c, d, Serializable {
    private final S3.c<Object> completion;

    public a(S3.c cVar) {
        this.completion = cVar;
    }

    public S3.c<C> create(S3.c<?> cVar) {
        l.f("completion", cVar);
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        S3.c<Object> cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final S3.c<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null || eVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i7 = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        f fVar = g.f9229b;
        f fVar2 = g.a;
        if (fVar == null) {
            try {
                f fVar3 = new f(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(ContentDisposition.Parameters.Name, new Class[0]));
                g.f9229b = fVar3;
                fVar = fVar3;
            } catch (Exception unused2) {
                g.f9229b = fVar2;
                fVar = fVar2;
            }
        }
        if (fVar != fVar2 && (method = fVar.a) != null && (objInvoke = method.invoke(getClass(), new Object[0])) != null && (method2 = fVar.f9227b) != null && (objInvoke2 = method2.invoke(objInvoke, new Object[0])) != null) {
            Method method3 = fVar.f9228c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i7);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // S3.c
    public final void resumeWith(Object obj) {
        S3.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            S3.c cVar2 = aVar.completion;
            l.c(cVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == T3.a.f9048k) {
                    return;
                }
            } catch (Throwable th) {
                obj = r.r(th);
            }
            aVar.releaseIntercepted();
            if (!(cVar2 instanceof a)) {
                cVar2.resumeWith(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public S3.c<C> create(Object obj, S3.c<?> cVar) {
        l.f("completion", cVar);
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
