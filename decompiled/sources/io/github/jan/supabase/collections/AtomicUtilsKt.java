package io.github.jan.supabase.collections;

import e4.k;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0005H\u0000¢\u0006\u0002\u0010\u0006\u001a1\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0005H\u0000¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"updateIfChanged", "", "T", "Lkotlin/concurrent/atomics/AtomicReference;", "callback", "Lkotlin/Function1;", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;)Z", "update", "", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;)V", "supabase-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AtomicUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void update(AtomicReference<T> atomicReference, k kVar) {
        l.f("<this>", atomicReference);
        l.f("callback", kVar);
        while (true) {
            Object obj = atomicReference.get();
            Object objInvoke = kVar.invoke(obj);
            while (!atomicReference.compareAndSet(obj, objInvoke)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean updateIfChanged(AtomicReference<T> atomicReference, k kVar) {
        l.f("<this>", atomicReference);
        l.f("callback", kVar);
        while (true) {
            Object obj = atomicReference.get();
            Object objInvoke = kVar.invoke(obj);
            if (obj == objInvoke) {
                return false;
            }
            while (!atomicReference.compareAndSet(obj, objInvoke)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            return true;
        }
    }
}
