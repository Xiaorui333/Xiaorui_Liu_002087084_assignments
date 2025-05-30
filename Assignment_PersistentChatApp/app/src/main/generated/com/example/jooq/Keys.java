/*
 * This file is generated by jOOQ.
 */
package com.example.jooq;


import com.example.jooq.tables.MessageHistory;
import com.example.jooq.tables.records.MessageHistoryRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<MessageHistoryRecord> MESSAGE_HISTORY_PKEY = Internal.createUniqueKey(MessageHistory.MESSAGE_HISTORY, DSL.name("message_history_pkey"), new TableField[] { MessageHistory.MESSAGE_HISTORY.ID }, true);
}
