package io.ktor.util;

import P3.q;
import e4.k;
import e4.n;
import io.ktor.http.ContentDisposition;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cJ\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\f0\tH&¢\u0006\u0004\b\r\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0012J/\u0010\u0016\u001a\u00020\u00142\u001e\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH&¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001d"}, d2 = {"Lio/ktor/util/StringValues;", "", "", ContentDisposition.Parameters.Name, "get", "(Ljava/lang/String;)Ljava/lang/String;", "", "getAll", "(Ljava/lang/String;)Ljava/util/List;", "", "names", "()Ljava/util/Set;", "", "entries", "", "contains", "(Ljava/lang/String;)Z", "value", "(Ljava/lang/String;Ljava/lang/String;)Z", "Lkotlin/Function2;", "LO3/C;", "body", "forEach", "(Le4/n;)V", "isEmpty", "()Z", "getCaseInsensitiveName", "caseInsensitiveName", "Companion", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface StringValues {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"Lio/ktor/util/StringValues$Companion;", "", "<init>", "()V", "", "caseInsensitiveName", "Lkotlin/Function1;", "Lio/ktor/util/StringValuesBuilder;", "LO3/C;", "builder", "Lio/ktor/util/StringValues;", "build", "(ZLe4/k;)Lio/ktor/util/StringValues;", "Empty", "Lio/ktor/util/StringValues;", "getEmpty", "()Lio/ktor/util/StringValues;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final StringValues Empty = new StringValuesImpl(false, null, 3, 0 == true ? 1 : 0);

        private Companion() {
        }

        public static /* synthetic */ StringValues build$default(Companion companion, boolean z7, k kVar, int i7, Object obj) {
            int i8 = i7 & 1;
            int i9 = 0;
            if (i8 != 0) {
                z7 = false;
            }
            l.f("builder", kVar);
            StringValuesBuilderImpl stringValuesBuilderImpl = new StringValuesBuilderImpl(z7, i9, 2, null);
            kVar.invoke(stringValuesBuilderImpl);
            return stringValuesBuilderImpl.build();
        }

        public final StringValues build(boolean caseInsensitiveName, k builder) {
            l.f("builder", builder);
            StringValuesBuilderImpl stringValuesBuilderImpl = new StringValuesBuilderImpl(caseInsensitiveName, 0, 2, null);
            builder.invoke(stringValuesBuilderImpl);
            return stringValuesBuilderImpl.build();
        }

        public final StringValues getEmpty() {
            return Empty;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean contains(StringValues stringValues, String str) {
            l.f(ContentDisposition.Parameters.Name, str);
            return stringValues.getAll(str) != null;
        }

        public static void forEach(StringValues stringValues, n nVar) {
            l.f("body", nVar);
            Iterator<T> it = stringValues.entries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                nVar.invoke((String) entry.getKey(), (List) entry.getValue());
            }
        }

        public static String get(StringValues stringValues, String str) {
            l.f(ContentDisposition.Parameters.Name, str);
            List<String> all = stringValues.getAll(str);
            if (all != null) {
                return (String) q.t0(all);
            }
            return null;
        }

        public static boolean contains(StringValues stringValues, String str, String str2) {
            l.f(ContentDisposition.Parameters.Name, str);
            l.f("value", str2);
            List<String> all = stringValues.getAll(str);
            if (all != null) {
                return all.contains(str2);
            }
            return false;
        }
    }

    boolean contains(String name);

    boolean contains(String name, String value);

    Set<Map.Entry<String, List<String>>> entries();

    void forEach(n body);

    String get(String name);

    List<String> getAll(String name);

    boolean getCaseInsensitiveName();

    boolean isEmpty();

    Set<String> names();
}
