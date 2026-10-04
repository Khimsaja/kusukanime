package com.kusukanime.data;

import B1.C0017d;
import D4.S;
import D6.C0108b;
import D6.C0109c;
import D6.ExecutorC0107a;
import D6.O;
import D6.W;
import G3.C0181a;
import G3.x;
import android.content.Context;
import f6.C0887A;
import f6.C0921s;
import f6.C0922t;
import f6.z;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0005H\u0002J\u0006\u0010\u0010\u001a\u00020\u0011R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/kusukanime/data/ApiClient;", "", "<init>", "()V", "api", "Lcom/kusukanime/data/KusuApi;", "baseUrl", "", "getBaseUrl", "()Ljava/lang/String;", "setBaseUrl", "(Ljava/lang/String;)V", "get", "context", "Landroid/content/Context;", "build", "reset", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApiClient {
    private static volatile KusuApi api;
    public static final ApiClient INSTANCE = new ApiClient();
    private static String baseUrl = "https://api.kusukanime.id/";
    public static final int $stable = 8;

    private ApiClient() {
    }

    private final KusuApi build() throws IllegalArgumentException {
        S s7 = new S(1, false);
        s7.f1530k.add(0, new C0181a(6));
        x xVar = new x(s7);
        z zVar = new z();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        zVar.a(15L, timeUnit);
        zVar.f11651x = g6.b.b(25L, timeUnit);
        u6.b bVar = new u6.b();
        bVar.f16348b = 2;
        zVar.f11630c.add(bVar);
        C0887A c0887a = new C0887A(zVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str = baseUrl;
        Objects.requireNonNull(str, "baseUrl == null");
        C0921s c0921s = new C0921s();
        c0921s.c(null, str);
        C0922t c0922tA = c0921s.a();
        ArrayList arrayList3 = c0922tA.f11609f;
        if (!"".equals(arrayList3.get(arrayList3.size() - 1))) {
            throw new IllegalArgumentException("baseUrl must end in /: " + c0922tA);
        }
        arrayList.add(new E6.a(xVar));
        ExecutorC0107a executorC0107a = O.a;
        C0108b c0108b = O.f1683c;
        ArrayList arrayList4 = new ArrayList(arrayList2);
        List listB = c0108b.b(executorC0107a);
        arrayList4.addAll(listB);
        List listC = c0108b.c();
        ArrayList arrayList5 = new ArrayList(arrayList.size() + 1 + listC.size());
        arrayList5.add(new C0109c(0));
        arrayList5.addAll(arrayList);
        arrayList5.addAll(listC);
        List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList4);
        listB.size();
        C0017d c0017d = new C0017d(c0887a, c0922tA, listUnmodifiableList, listUnmodifiableList2);
        if (!KusuApi.class.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(KusuApi.class);
        while (!arrayDeque.isEmpty()) {
            Class cls = (Class) arrayDeque.removeFirst();
            if (cls.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls.getName());
                if (cls != KusuApi.class) {
                    sb.append(" which is an interface of ");
                    sb.append(KusuApi.class.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls.getInterfaces());
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(KusuApi.class.getClassLoader(), new Class[]{KusuApi.class}, new W(c0017d));
        l.e("create(...)", objNewProxyInstance);
        return (KusuApi) objNewProxyInstance;
    }

    public final KusuApi get(Context context) {
        KusuApi kusuApiBuild;
        l.f("context", context);
        KusuApi kusuApi = api;
        if (kusuApi != null) {
            return kusuApi;
        }
        synchronized (this) {
            kusuApiBuild = api;
            if (kusuApiBuild == null) {
                kusuApiBuild = INSTANCE.build();
                api = kusuApiBuild;
            }
        }
        return kusuApiBuild;
    }

    public final String getBaseUrl() {
        return baseUrl;
    }

    public final void reset() {
        api = null;
    }

    public final void setBaseUrl(String str) {
        l.f("<set-?>", str);
        baseUrl = str;
    }
}
