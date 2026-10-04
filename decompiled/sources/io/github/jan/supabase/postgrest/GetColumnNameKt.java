package io.github.jan.supabase.postgrest;

import V5.h;
import io.github.jan.supabase.annotations.SupabaseInternal;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import l4.InterfaceC1442u;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005H\u0007¨\u0006\u0006"}, d2 = {"getSerialName", "", "T", "V", "property", "Lkotlin/reflect/KProperty1;", "postgrest-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetColumnNameKt {
    @SupabaseInternal
    public static final <T, V> String getSerialName(InterfaceC1442u interfaceC1442u) {
        T next;
        String strValue;
        l.f("property", interfaceC1442u);
        Iterator<T> it = interfaceC1442u.getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Annotation) next) instanceof h) {
                break;
            }
        }
        h hVar = (h) next;
        return (hVar == null || (strValue = hVar.value()) == null) ? interfaceC1442u.getName() : strValue;
    }
}
