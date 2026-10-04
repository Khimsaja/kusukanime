package io.ktor.events;

import H5.N;
import e4.k;
import io.ktor.client.request.a;
import io.ktor.util.collections.CopyOnWriteHashMap;
import io.ktor.util.internal.LockFreeLinkedListHead;
import io.ktor.util.internal.LockFreeLinkedListNode;
import kotlin.Metadata;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.l;
import q0.c;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0004\b\f\u0010\rJ?\u0010\u000e\u001a\u00020\b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lio/ktor/events/Events;", "", "<init>", "()V", "T", "Lio/ktor/events/EventDefinition;", "definition", "Lkotlin/Function1;", "LO3/C;", "Lio/ktor/events/EventHandler;", "handler", "LH5/N;", "subscribe", "(Lio/ktor/events/EventDefinition;Le4/k;)LH5/N;", "unsubscribe", "(Lio/ktor/events/EventDefinition;Le4/k;)V", "value", "raise", "(Lio/ktor/events/EventDefinition;Ljava/lang/Object;)V", "Lio/ktor/util/collections/CopyOnWriteHashMap;", "Lio/ktor/util/internal/LockFreeLinkedListHead;", "handlers", "Lio/ktor/util/collections/CopyOnWriteHashMap;", "HandlerRegistration", "ktor-events"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Events {
    private final CopyOnWriteHashMap<EventDefinition<?>, LockFreeLinkedListHead> handlers = new CopyOnWriteHashMap<>();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u0003j\u0006\u0012\u0002\b\u0003`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR)\u0010\u0006\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u0003j\u0006\u0012\u0002\b\u0003`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/events/Events$HandlerRegistration;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "LH5/N;", "Lkotlin/Function1;", "LO3/C;", "Lio/ktor/events/EventHandler;", "handler", "<init>", "(Le4/k;)V", "dispose", "()V", "Le4/k;", "getHandler", "()Le4/k;", "ktor-events"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HandlerRegistration extends LockFreeLinkedListNode implements N {
        private final k handler;

        public HandlerRegistration(k kVar) {
            l.f("handler", kVar);
            this.handler = kVar;
        }

        @Override // H5.N
        public void dispose() {
            remove();
        }

        public final k getHandler() {
            return this.handler;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LockFreeLinkedListHead subscribe$lambda$0(EventDefinition eventDefinition) {
        l.f("it", eventDefinition);
        return new LockFreeLinkedListHead();
    }

    public final <T> void raise(EventDefinition<T> definition, T value) {
        l.f("definition", definition);
        LockFreeLinkedListHead lockFreeLinkedListHead = this.handlers.get(definition);
        Throwable th = null;
        if (lockFreeLinkedListHead != null) {
            Object next = lockFreeLinkedListHead.getNext();
            l.d("null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode", next);
            for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !l.a(nextNode, lockFreeLinkedListHead); nextNode = nextNode.getNextNode()) {
                if (nextNode instanceof HandlerRegistration) {
                    try {
                        k handler = ((HandlerRegistration) nextNode).getHandler();
                        l.d("null cannot be cast to non-null type kotlin.Function1<T of io.ktor.events.Events.raise, kotlin.Unit>", handler);
                        B.e(1, handler);
                        handler.invoke(value);
                    } catch (Throwable th2) {
                        if (th != null) {
                            c.j(th, th2);
                        } else {
                            th = th2;
                        }
                    }
                }
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final <T> N subscribe(EventDefinition<T> definition, k handler) {
        l.f("definition", definition);
        l.f("handler", handler);
        HandlerRegistration handlerRegistration = new HandlerRegistration(handler);
        this.handlers.computeIfAbsent(definition, new a(10)).addLast(handlerRegistration);
        return handlerRegistration;
    }

    public final <T> void unsubscribe(EventDefinition<T> definition, k handler) {
        l.f("definition", definition);
        l.f("handler", handler);
        LockFreeLinkedListHead lockFreeLinkedListHead = this.handlers.get(definition);
        if (lockFreeLinkedListHead != null) {
            Object next = lockFreeLinkedListHead.getNext();
            l.d("null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode", next);
            for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !l.a(nextNode, lockFreeLinkedListHead); nextNode = nextNode.getNextNode()) {
                if (nextNode instanceof HandlerRegistration) {
                    HandlerRegistration handlerRegistration = (HandlerRegistration) nextNode;
                    if (l.a(handlerRegistration.getHandler(), handler)) {
                        handlerRegistration.remove();
                    }
                }
            }
        }
    }
}
